@cucumber.api.java.en.When(value = "^\"([^\"]*)\" starts with prefix \"([^\"]*)\"$")
public void startsWithPrefix(final java.lang.String arg1, final java.lang.String arg2) throws java.lang.Throwable {
    result = tpString.startsWtih(arg1.getBytes(), getMarker(arg1), arg2.getBytes(), getMarker(arg2));
}