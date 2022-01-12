public void CreateOnClick(android.view.View view) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("ID", java.lang.String.valueOf(ID));
    switch (view.getId()) {
        case R.id.createItemBtn :
            android.content.Intent create = new android.content.Intent(this, com.example.csanders.getfit.Views.Create.class);
            create.putExtras(bundle);
            startActivity(create);
            break;
    }
}