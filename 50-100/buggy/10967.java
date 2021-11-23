public void cleanUp() {
    switch (templateSelection) {
        case SPECIFIC_VALUE :
            single_value = null;
            break;
        case VALUE_LIST :
        case COMPLEMENTED_LIST :
            value_list.clear();
            value_list = null;
        case VALUE_RANGE :
            min_value = null;
            max_value = null;
        default :
            break;
    }
    templateSelection = template_sel.UNINITIALIZED_TEMPLATE;
}