public void stashDataEntry(com.codebrig.jvmmechanic.agent.stash.DataEntry dataEntry) throws java.io.IOException {
    fileChannel.write(dataEntry.toByteBuffer());
}