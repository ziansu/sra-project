@java.lang.Override
public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws org.springframework.beans.BeansException {
    com.dvsv2.study.tools.mail.services.DynamicCronTask.ParseInvokeHandler.applicationContext = applicationContext;
}