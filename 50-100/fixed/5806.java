private void generateViewCreator(org.cruxframework.crux.core.rebind.screen.widget.SourcePrinter sourceWriter, org.cruxframework.crux.core.rebind.screen.View view) {
    org.cruxframework.crux.core.rebind.screen.widget.ViewFactoryCreator factoryCreator = getViewFactoryCreator(view);
    try {
        sourceWriter.println((("callback.onViewCreated(new " + (factoryCreator.create())) + "(id));"));
    } finally {
        factoryCreator.prepare(null, true, null, null);
    }
}