public static com.github.vatbub.common.core.Common getInstance() {
    synchronized(com.github.vatbub.common.core.Common.instance) {
        if ((com.github.vatbub.common.core.Common.instance) == null) {
            com.github.vatbub.common.core.Common.instance = new com.github.vatbub.common.core.Common();
        }
        return com.github.vatbub.common.core.Common.instance;
    }
}