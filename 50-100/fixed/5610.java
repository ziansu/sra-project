@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case moe.akagi.chibaproject.activity.AddEvent.PLACEMAPCREATE_ACTIVITY :
            if (resultCode == (RESULT_OK)) {
                location.copyConstruct(((moe.akagi.chibaproject.datatype.Location) (data.getSerializableExtra("location"))));
            }
            break;
    }
}