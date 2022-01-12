@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flag) {
    out.writeString(address);
    out.writeString(postAddress);
    out.writeInt(orderSum);
    out.writeInt(orderNo);
    out.writeByte(((byte) (isDelivered ? 1 : 0)));
    out.writeString(deliveryDate);
    out.writeDouble(latitude);
    out.writeDouble(longitude);
    out.writeInt(customerNo);
    out.writeInt(deliveredBy);
    out.writeString(customerName);
}