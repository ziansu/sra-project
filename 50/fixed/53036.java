@java.lang.Override
public void write(org.jtrfp.jfdt.EndianAwareDataOutputStream os, org.jtrfp.jfdt.ThirdPartyParseable bean) throws java.io.IOException {
    os.writeInt(dest.get(bean).intValue());
}