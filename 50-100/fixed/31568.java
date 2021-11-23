@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mAnimCheckBox1 = ((com.github.lguipeng.library.animcheckbox.AnimCheckBox) (findViewById(R.id.checkbox_1)));
    mAnimCheckBox2 = ((com.github.lguipeng.library.animcheckbox.AnimCheckBox) (findViewById(R.id.checkbox_2)));
    mAnimCheckBox1.setOnCheckedChangeListener(this);
    mAnimCheckBox2.setOnCheckedChangeListener(this);
}