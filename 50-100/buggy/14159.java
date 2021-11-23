@java.lang.Override
public void writeAFP(java.io.OutputStream os, com.mgz.afp.parser.AFPParserConfiguration config) throws java.io.IOException {
    os.write(segmentType.toBytes());
    if ((name) != null)
        lengthOfFollowingData = ((short) (name.length));
    else
        lengthOfFollowingData = 0;
    
    os.write(lengthOfFollowingData);
    os.write(name);
}