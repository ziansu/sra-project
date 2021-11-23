protected void initToolbox(javax.servlet.ServletContext context) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(this.toolBoxLocation)) {
        this.toolboxManager = org.apache.velocity.tools.view.servlet.ServletToolboxManager.getInstance(context, this.toolBoxLocation);
    }else {
        org.apache.velocity.app.Velocity.info("VelocityViewServlet: No toolbox entry in configuration.");
    }
}