public static void registerAllTypes() {
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.serialization.FieldName.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.serialization.TypeName.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.book.Book.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.book.BookDeckList.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.book.BookDeckMap.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.book.BookDeckSet.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.product_data.ItemKey.class);
    org.jimmutable.core.serialization.reader.ObjectParseTree.registerTypeName(org.jimmutable.core.examples.product_data.ItemSpecifications.class);
}