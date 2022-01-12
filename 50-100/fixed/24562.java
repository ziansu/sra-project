@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.catrobat.catroid.common.SoundInfo)) {
        return false;
    }
    if (obj == (this)) {
        return true;
    }
    org.catrobat.catroid.common.SoundInfo soundInfo = ((org.catrobat.catroid.common.SoundInfo) (obj));
    return (soundInfo.fileName.equals(this.fileName)) && (soundInfo.name.equals(this.name));
}