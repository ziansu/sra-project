private void callInitializers() {
    for (skadistats.clarity.event.UsagePoint up : usagePoints) {
        if (up instanceof skadistats.clarity.event.InitializerMethod) {
            continue;
        }
        skadistats.clarity.event.InitializerMethod im = initializers.get(up.getUsagePointClass());
        if (im != null) {
            try {
                im.invoke(up);
            } catch (java.lang.Throwable e) {
                skadistats.clarity.decoder.Util.uncheckedThrow(e);
            }
        }
    }
}