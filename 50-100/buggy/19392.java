@butterknife.OnClick(value = R.id.button)
public void getSomeInfo() {
    fetch();
    if ((resultsList.size()) > 0) {
        textView.setText((((resultsList.size()) + " ") + (resultsList.get(0).getResponse().getPlan().getDate())));
    }else {
        android.util.Log.d("DANE", "NIE ZASSALO");
    }
}