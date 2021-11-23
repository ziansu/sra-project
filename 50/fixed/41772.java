@java.lang.Override
java.lang.String getDatePartExtractionSuffix(com.exedio.cope.DayPartView.DayPartField field) {
    switch (field) {
        case WEEK :
            return ", 'IW' )";
        default :
            return super.getDatePartExtractionSuffix(field);
    }
}