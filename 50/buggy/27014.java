public void start() {
    se.nackademin.christopherolsson.adressbook.client.CatalogueLoader catalogueLoader = new se.nackademin.christopherolsson.adressbook.client.CatalogueLoader();
    catalogueLoader.run();
    se.nackademin.christopherolsson.adressbook.user_interface.CommandLineInterface commandLineInterface = new se.nackademin.christopherolsson.adressbook.user_interface.CommandLineInterface();
}