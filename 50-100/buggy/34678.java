public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.delete :
            android.content.Intent intent = new android.content.Intent(this, com.example.setditjenp2mkt.adapterdemo.StudentActivity.class);
            int no = java.lang.Integer.parseInt(student.getNo());
            com.example.setditjenp2mkt.adapterdemo.StudentList list = com.example.setditjenp2mkt.adapterdemo.StudentList.getInstance();
            list.delete(no);
            startActivity(intent);
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}