@java.lang.Override
public void onEnable() {
    cloud.swiftnode.ksecurity.util.Static.runTaskAsync(() -> new cloud.swiftnode.ksecurity.module.kvaccine.abstraction.processor.VirusScanProcessor().process());
}