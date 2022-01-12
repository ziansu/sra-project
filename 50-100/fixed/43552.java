private static void c_0_4__0_5() {
    Items.XSTREAM2.addCompatibilityAlias("jenkins.plugins.shiningpanda.CustomVirtualenvBuilder", jenkins.plugins.shiningpanda.builders.CustomPythonBuilder.class);
    Items.XSTREAM2.addCompatibilityAlias("jenkins.plugins.shiningpanda.StandardPythonBuilder", jenkins.plugins.shiningpanda.builders.PythonBuilder.class);
    Items.XSTREAM2.addCompatibilityAlias("jenkins.plugins.shiningpanda.VirtualenvBuilder", jenkins.plugins.shiningpanda.builders.VirtualenvBuilder.class);
    Items.XSTREAM2.addCompatibilityAlias("jenkins.plugins.shiningpanda.PythonAxis", jenkins.plugins.shiningpanda.matrix.PythonAxis.class);
    Run.XSTREAM2.addCompatibilityAlias("jenkins.plugins.shiningpanda.PythonAxis", jenkins.plugins.shiningpanda.matrix.PythonAxis.class);
}