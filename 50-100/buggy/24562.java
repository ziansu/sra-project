@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.catrobat.catroid.common.SoundInfo)) {
        return false;
    }
    if (obj == (this)) {
        return true;
    }
    org.catrobat.catroid.common.SoundInfo soundInfo = ((org.catrobat.catroid.common.SoundInfo) (obj));
    if ((soundInfo.fileName.equals(this.fileName)) && (soundInfo.name.equals(this.name))) {
        return true;
    }
    return false;
}