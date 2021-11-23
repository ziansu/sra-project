@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode != (RESULT_OK)) {
        return ;
    }
    switch (requestCode) {
        case com.hjwylde.rivers.ui.activities.MapsActivity.REQUEST_CODE_SECTION_CREATED :
            onSectionCreated();
        case com.hjwylde.rivers.ui.activities.MapsActivity.REQUEST_CODE_SECTION_EDITED :
            com.hjwylde.rivers.models.Section section = ((com.hjwylde.rivers.models.Section) (data.getSerializableExtra(EditSectionActivity.INTENT_SECTION)));
            onSectionEdited(section);
    }
}