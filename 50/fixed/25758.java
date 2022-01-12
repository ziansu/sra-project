@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
edu.byu.support.feature.Feature another) {
    return getName().toLowerCase().compareTo(another.getName().toLowerCase());
}