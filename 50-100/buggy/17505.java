@java.lang.SuppressWarnings(value = "UnusedParameters")
public java.lang.reflect.Method parametrizedTestMethod(@ru.yandex.qatools.allure.annotations.Parameter
double doubleParameter, @ru.yandex.qatools.allure.annotations.Parameter(value = "valueFromAnnotation")
java.lang.String stringParameter, java.lang.String notParameter) {
    try {
        return getClass().getDeclaredMethod("parametrizedTestMethod", double.class, java.lang.String.class, java.lang.String.class);
    } catch (java.lang.NoSuchMethodException e) {
        throw new java.lang.RuntimeException(e);
    }
}