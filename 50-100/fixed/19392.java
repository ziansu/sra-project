@butterknife.OnClick(value = R.id.button)
public void getSomeInfo() {
    fetch();
    if ((resultsList.size()) > 0) {
        textView.setText(((resultsList.size()) + " "));
    }else {
        android.util.Log.d("DANE", "NIE ZASSALO");
    }
}