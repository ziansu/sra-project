public void onItemSelected(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    NameSpinId = arg2 + 1;
    java.lang.System.out.println("ѡ�еı�����");
    java.lang.System.out.println(NameSpinId);
    MyCodeClass = MyControl.GetCodeclass(new java.lang.Integer(NameSpinId));
    arg0.setVisibility(View.VISIBLE);
}