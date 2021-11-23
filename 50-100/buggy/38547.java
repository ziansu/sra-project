@butterknife.OnClick(value = R.id.ok_btn)
public void onOkClicked() {
    if ((values) != null) {
        int position = (pickerNp.getValue()) - 1;
        if (position < (values.length)) {
            int value = values[position];
            if ((callback) != null)
                callback.onOkClicked(value);
            
        }
    }
    hide();
}