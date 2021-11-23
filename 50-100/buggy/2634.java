private int numberOfTranslationReactionsInModelTree() throws java.lang.Exception {
    int number_of_records = 0;
    java.lang.String translation_class_name_key = (_package_name_parser_delegate) + ".VLCGNFBATranslationParserDelegate";
    java.util.Vector<org.varnerlab.kwatee.nfbamodel.VLCGNFBAModelComponent> translation_component_vector = _model_component_table.get(java.lang.Class.forName(translation_class_name_key));
    number_of_records = translation_component_vector.size();
    return number_of_records;
}