protected org.ops4j.pax.exam.Option[] configureVmOptions() {
    return org.ops4j.pax.exam.CoreOptions.options(org.ops4j.pax.exam.CoreOptions.vmOption("-Xmx2048M"), org.ops4j.pax.exam.CoreOptions.vmOption("-Djava.awt.headless=true"));
}