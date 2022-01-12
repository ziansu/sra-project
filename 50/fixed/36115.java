public static int getSpinnerLabelPhone(int type) {
    switch (type) {
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_HOME :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_HOME;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_WORK :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_WORK;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_MOBILE :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_MOBILE;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_PHONE_OTHER :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_OTHER;
        default :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_OTHER;
    }
}