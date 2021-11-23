@javax.annotation.PreDestroy
public void dispose() {
    for (int i = (this.objects.size()) - 1; i >= 0; i--) {
        try {
            this.dispose.accept(this.objects.get(i));
        } catch (java.lang.Throwable t) {
        }
    }
}