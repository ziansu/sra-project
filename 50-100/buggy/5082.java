private static org.chromium.chrome.browser.cookies.CanonicalCookie createFromStream(java.io.DataInputStream in) throws java.io.IOException {
    return new org.chromium.chrome.browser.cookies.CanonicalCookie(in.readUTF(), in.readUTF(), in.readUTF(), in.readUTF(), in.readUTF(), in.readLong(), in.readLong(), in.readLong(), in.readBoolean(), in.readBoolean(), in.readInt(), in.readInt());
}