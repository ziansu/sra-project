@butterknife.OnClick(value = { R.id.btn_search , R.id.btn_reset })
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.btn_search :
            if ((keymap) != null) {
                keymap.clear();
            }
            if (checkInput()) {
                getDataFromPost();
            }else
                if (!(checkInput())) {
                    com.gdou.www.gdouaqualib.utils.ToastUtil.show(this, "请至少输入一项");
                }
            
            break;
        case R.id.btn_reset :
            allReset();
            break;
    }
}