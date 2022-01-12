@android.support.annotation.NonNull
@java.lang.Override
public java.lang.Object clone() {
    super.clone();
    byte[] result = new byte[data.length];
    java.lang.System.arraycopy(data, 0, result, 0, data.length);
    return new jp.kshoji.javax.sound.midi.MetaMessage(result);
}