@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case moe.akagi.chibaproject.activity.AddEvent.PLACEMAPCREATE_ACTIVITY :
            if (resultCode == (RESULT_OK)) {
                location.copyConstruct(((moe.akagi.chibaproject.datatype.Location) (data.getSerializableExtra("location"))));
                android.widget.Toast.makeText(this, ("Test " + (location.getName())), Toast.LENGTH_SHORT).show();
            }else {
                location.setName("待定");
            }
            break;
    }
}