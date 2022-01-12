public uk.ac.stfc.isis.ibex.configserver.configuration.Configuration asConfiguration() {
    uk.ac.stfc.isis.ibex.configserver.configuration.Configuration config = new uk.ac.stfc.isis.ibex.configserver.configuration.Configuration(getName(), getDescription(), getSynoptic(), getIocs(), getBlocks(), getGroups(), getComponents(), getHistory());
    return new uk.ac.stfc.isis.ibex.configserver.internal.ComponentFilteredConfiguration(config);
}