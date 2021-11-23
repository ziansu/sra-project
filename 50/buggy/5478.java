@java.lang.Override
public void onClusterItemInfoWindowClick(com.bridge.soom.Model.ProviderBasic providerBasic) {
    android.widget.Toast.makeText(this, ((providerBasic.getUserFirstName()) + " Clicked"), Toast.LENGTH_SHORT).show();
}