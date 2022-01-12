@org.springframework.context.annotation.Bean(name = "org.tiogasolutions.notify.kernel.config.SystemConfiguration")
public org.tiogasolutions.notify.kernel.config.SystemConfiguration systemConfiguration() {
    return new org.tiogasolutions.notify.kernel.config.SystemConfiguration("*", false);
}