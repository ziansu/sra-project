@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    add_fermat_user = ((com.bitdubai.fermat_android_api.layer.definition.wallet.views.FermatButton) (findViewById(R.id.add_fermat_user)));
    add_extra_user = ((com.bitdubai.fermat_android_api.layer.definition.wallet.views.FermatButton) (findViewById(R.id.add_extra_user)));
    checkbox_not_show = ((android.widget.CheckBox) (findViewById(R.id.checkbox_not_show)));
    checkbox_not_show.setChecked(true);
    add_fermat_user.setOnClickListener(this);
    add_extra_user.setOnClickListener(this);
}