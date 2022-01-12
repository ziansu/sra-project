@java.lang.Override
public void onFirstAddShoppingCart() {
    android.view.ViewStub viewStub = ((android.view.ViewStub) (findViewById(R.id.shopping_car_spotlight_vs)));
    if (viewStub != null) {
        final android.view.View spotLightShoppingCarLayout = viewStub.inflate();
        android.widget.Button spotLightConfirmButton = ((android.widget.Button) (spotLightShoppingCarLayout.findViewById(R.id.confirm_button)));
        spotLightConfirmButton.setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                spotLightShoppingCarLayout.setVisibility(View.INVISIBLE);
            }
        });
    }
}