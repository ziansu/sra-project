@org.junit.Test
public void shouldNotCreateCpuPinningForVirtualNumaNodes() {
    for (org.ovirt.engine.core.common.businessentities.VmNumaNode numaNode : org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactoryTest.vmNumaNodes) {
        numaNode.getVdsNumaNodeList().clear();
    }
    java.util.Map<java.lang.String, java.lang.Object> cpuPinning = org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactory.buildCpuPinningWithNumaSetting(org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactoryTest.vmNumaNodes, org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactoryTest.vdsNumaNodes);
    org.assertj.core.api.Assertions.assertThat(cpuPinning).isEmpty();
    java.util.Map<java.lang.String, java.lang.Object> mapping = org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactory.buildVmNumatuneSetting(NumaTuneMode.INTERLEAVE, org.ovirt.engine.core.vdsbroker.vdsbroker.NumaSettingFactoryTest.vmNumaNodes);
    org.assertj.core.api.Assertions.assertThat(mapping).doesNotContainKeys(VdsProperties.NUMA_TUNE_MODE, VdsProperties.NUMA_TUNE_NODESET);
}