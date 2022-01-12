@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    dest.writeString(address);
    dest.writeString(category);
    dest.writeString(email);
    dest.writeString(phone_no);
    dest.writeLong(ratings);
    dest.writeString(shop_name);
    dest.writeString(vendor_id);
    dest.writeString(shop_key);
    dest.writeString(image);
    dest.writeLong(queueCount);
}