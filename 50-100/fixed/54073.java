@org.aspectj.lang.annotation.AfterReturning(pointcut = "updateItemOps() && args(srcItem, destItem, mergeAssociations)")
public void recalcOnUpdate(@lombok.NonNull
com.expedia.seiso.domain.entity.Item srcItem, @lombok.NonNull
com.expedia.seiso.domain.entity.Item destItem, boolean mergeAssociations) {
    if (destItem instanceof com.expedia.seiso.domain.entity.Endpoint) {
        recalcNipAndNode(((com.expedia.seiso.domain.entity.Endpoint) (destItem)).getIpAddress());
    }else
        if (destItem instanceof com.expedia.seiso.domain.entity.NodeIpAddress) {
            recalcNipAndNode(((com.expedia.seiso.domain.entity.NodeIpAddress) (destItem)));
        }
    
}