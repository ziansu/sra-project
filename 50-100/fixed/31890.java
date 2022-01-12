@java.lang.Override
public java.util.Iterator<org.openqa.selenium.WebElement> iterator() {
    return new java.util.Iterator<org.openqa.selenium.WebElement>() {
        int i = 0;

        @java.lang.Override
        public boolean hasNext() {
            return (i) < (length);
        }

        @java.lang.Override
        public org.openqa.selenium.WebElement next() {
            return get(((i)++));
        }

        @java.lang.Override
        public void remove() {
            throw new java.lang.IllegalAccessError("Not implemented");
        }
    };
}