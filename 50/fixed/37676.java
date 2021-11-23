@hugo.weaving.DebugLog
@java.lang.Override
public void onServiceItemClick(int position) {
    fragmentManager.beginTransaction().addToBackStack("characteristic").replace(R.id.detail_fragment_view, characteristicListFragment, "characteristic").commit();
    bluetoothGattCharacteristics = bluetoothGattServices.get(position).getCharacteristics();
    onCharacteristicReady();
}