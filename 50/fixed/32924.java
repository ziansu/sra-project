@dagger.Provides
@javax.inject.Named(value = "androidBluetoothPlatform")
@javax.inject.Singleton
public com.sensorberg.sdk.internal.interfaces.BluetoothPlatform provideAndroidBluetoothPlatform(android.bluetooth.BluetoothAdapter adapter, android.content.Context context) {
    return new com.sensorberg.sdk.internal.AndroidBluetoothPlatform(adapter, context);
}