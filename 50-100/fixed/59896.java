@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_shopping_cart);
    btnMain = ((android.widget.Button) (findViewById(R.id.cart_btn_bk_main)));
    btnMain.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            mMainIntent = new android.content.Intent(com.andreakim.artsupplies.ShoppingCartActivity.this, com.andreakim.artsupplies.MainActivity.class);
            startActivity(mMainIntent);
        }
    });
}