private boolean checkInput(java.lang.String remarks, java.lang.String money, java.lang.String date) {
    if (("".equals(money)) || ("".equals(date))) {
        android.widget.Toast.makeText(getActivity(), "���벻��Ϊ�գ�", Toast.LENGTH_SHORT).show();
        return false;
    }
    return true;
}