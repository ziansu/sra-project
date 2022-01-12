private void setClickListener(android.view.View view) {
    if ((view.getId()) == (com.orhanobut.dialogplus.DialogPlus.INVALID)) {
        return ;
    }
    if (view instanceof android.widget.AdapterView) {
        return ;
    }
    if ((onClickListener) != null) {
        view.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                onClickListener.onClick(com.orhanobut.dialogplus.DialogPlus.this, v);
            }
        });
    }
}