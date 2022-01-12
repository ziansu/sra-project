public void write(java.io.DataOutputStream output) throws java.io.IOException {
    android.util.Log.d("Geocollection Interval", "in Write function");
    android.util.Log.d("Geocollection Interval", ("WriteFunction LatString= " + (this.mGeolatsring)));
    android.util.Log.d("Geocollection Interval", ("WriteFunction LatString= " + (this.mGeolongstring)));
    output.writeLong(this.mUnixEpoch);
    output.writeChars(this.mGeolatsring);
    output.writeChars(this.mGeolongstring);
}