@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if (position < (data.getCount())) {
        java.lang.Object item = data.getItem(position);
        if (item instanceof itkach.aard2.BlobDescriptor) {
            return ((itkach.aard2.BlobDescriptor) (item)).key;
        }
        if (item instanceof itkach.slob.Slob.Blob) {
            return ((itkach.slob.Slob.Blob) (item)).key;
        }
    }
    return "???";
}