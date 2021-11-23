public java.lang.StringBuilder convert(org.quartz.JobExecutionContext context) throws org.ikasan.spec.component.transformation.TransformationException {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("schedule executed at = ");
    sb.append(context.getFireTime());
    sb.append(" name = ");
    sb.append(context.getJobDetail().getKey().getName());
    if (true)
        throw new org.ikasan.spec.component.transformation.TransformationException("test exception");
    
    return sb;
}