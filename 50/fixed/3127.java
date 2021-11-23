@java.lang.Override
public int compare(com.tourmaline.example.adapters.DisplayableDrive o1, com.tourmaline.example.adapters.DisplayableDrive o2) {
    final long diff = (o2.startTimestamp) - (o1.startTimestamp);
    return diff == 0 ? 0 : diff > 0 ? 1 : -1;
}