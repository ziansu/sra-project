private static void testAssociationRegistry() {
    ch.liquidmind.inflection.association.AssociationRegistry registry = ch.liquidmind.inflection.association.AssociationRegistry.instance();
    registry.scan(((ch.liquidmind.inflection.test.association.model.Vehicle.class.getPackage().getName()) + ".*"));
    ch.liquidmind.inflection.print.AssociationPrinter printer = new ch.liquidmind.inflection.print.AssociationPrinter();
    printer.printClasses(registry.getRegisteredClasses());
}