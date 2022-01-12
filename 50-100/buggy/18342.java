protected void resetHerbert() {
    org.cocos2d.nodes.CCSprite spriteHerbert = ((org.cocos2d.nodes.CCSprite) (getChildByTag(kHerbertTag)));
    herbert_pos = new org.cocos2d.types.CGPoint();
    herbert_pos.set(160, 160);
    spriteHerbert.setPosition(herbert_pos);
    herbert_vel = new org.cocos2d.types.ccVertex2F();
    herbert_vel.setCGPoint(org.cocos2d.types.CGPoint.ccp(0, 0));
    herbert_acc = new org.cocos2d.types.ccVertex2F();
    herbert_acc.setCGPoint(org.cocos2d.types.CGPoint.ccp(0, (-300.0F)));
    herbert.setScaleX(1.0F);
}